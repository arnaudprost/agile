/*
 * Copyright 2005 Arnaud Prost
 * 
 * Arnaud.prost@gmail.com
 * 
 * This software is a computer program whose purpose is to ease the 
 * management of software project.
 * 
 * This software is governed by the CeCILL  license under French law and
 * abiding by the rules of distribution of free software.  You can  use, 
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info". 
 * 
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability. 
 * 
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or 
 * data to be ensured and,  more generally, to use and operate it in the 
 * same conditions as regards security. 
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 */
package net.sf.pmr.toDo.domain.todo;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import net.sf.pmr.core.domain.project.MockProjectProxyUtil;
import net.sf.pmr.core.domain.project.Project;
import net.sf.pmr.core.domain.project.ProjectImpl;
import net.sf.pmr.toDo.ToDoObjectFactory;
import net.sf.pmr.toDo.data.todo.MockToDoMapper;
import de.abstrakt.mock.MockCore;


public class ToDoRepositoryTest extends TestCase {
	
	private ToDo toDo;
	
    private MockProjectProxyUtil mockProjectProxyUtil;
    
    private MockToDoMapper mockToDoMapper;
    
    private Project project;
    
    private ToDoRepository toDoRepository;
    

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        
        mockToDoMapper = new MockToDoMapper();
        
        mockProjectProxyUtil = new MockProjectProxyUtil();
        
        project = new ProjectImpl();
        
        toDoRepository = new ToDoRepositoryImpl(mockToDoMapper, mockProjectProxyUtil);
        
        toDo = new ToDoImpl();        
        
        MockCore.reset();

    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * test que le repository est bien un singleton.
     */
    public void testIsASingleton() {

        assertTrue("singleton", ToDoObjectFactory.isSingleton("toDoRepository"));

    }

    /**
     * BasicProject est un proxy à cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour ajout en base,
     */
    public void testAddOrUpdate() {

    	// ajout d'un basic projet
    	toDo.setProject(project);

    	// basic projectTarget
        Project projectTarget = new ProjectImpl();

        // le basicProjectProxyUtil doit retrourner la target 
        mockProjectProxyUtil.expectGetTarget(project,
                projectTarget);

        // il doit ensuite avoir un appel au mock
        mockToDoMapper.expectAddOrUpdate(toDo);

        // appel de la méthode
        toDoRepository.addOrUpdate(toDo);

        // contrôle de l'appel des méthodes
        MockCore.verify();

        // contrôle que la project est la target
        assertSame(toDo.getProject(), projectTarget);

    }
    
    /**
     * BasicProject est un proxy à cause du lazy load fait par AOP pour la
     * methode getMembers Avant d'envoyer l'object au mapper pour ajout en base,
     */
    public void testDelete() {

    	// ajout d'un basic projet
    	toDo.setProject(project);

    	// basic projectTarget
        Project projectTarget = new ProjectImpl();

        // le basicProjectProxyUtil doit retrourner la target 
        mockProjectProxyUtil.expectGetTarget(project, projectTarget);

        // il doit ensuite avoir un appel au mock
        mockToDoMapper.expectDelete(toDo);

        // appel de la méthode
        toDoRepository.delete(toDo);

        // contrôle de l'appel des méthodes
        MockCore.verify();

        // contrôle que la project est la target
        assertSame(toDo.getProject(), projectTarget);

    }


    /**
     * Test que la repository renvoit un Basic Project "Advised".
     */
    public void testFindByPersistanceId() {

    	// ajout du project
        toDo.setProject(project);

        // projet à retourner
        Project projectToReturn = new ProjectImpl();

        // le mapper doit renvoyer un toDo
        mockToDoMapper.expectFindById(1, toDo);

        // le ProxyUtil doit injecter les dépendances
        mockProjectProxyUtil.expectInjectDependencies(project,
                projectToReturn);

        // appel de la méthode find
        toDoRepository.findByPersistanceId(1);

        // vérification des appels
        MockCore.verify();

        // contrôle que le projet est bien récupéré
        assertSame(toDo.getProject(), projectToReturn);

    }
    
    /**
     * Test que la repository n'"advised" pas la basicProjet si le ToDo n'est pas trouvé (null)
     */
    public void testFindByPersistanceIdWhenToDoIsNotFound() {

        // le mapper doit renvoyer un toDo
        mockToDoMapper.expectFindById(1, null);

        // appel de la méthode find
       ToDo toDo = toDoRepository.findByPersistanceId(1);

        // vérification des appels
        MockCore.verify();

        // conttrôle que le retour est null
        assertNull(toDo);

    }

    /**
     * Test que la repository renvoit bien des BasicProject "Advised".
     */
    public void testFindByUserPersistanceId() {
    
        List<ToDo> listOfToDos = new ArrayList<ToDo>();
    	
        // construction des deux ToDO retournés par le mockMapper
    	ToDo toDo1 = new ToDoImpl();
    	toDo.setDescription("toto");
    	Project project1 = new ProjectImpl();
    	toDo1.setProject(project1);
    	
    	ToDo toDo2 = new ToDoImpl();
    	toDo1.setDescription("titi");
    	Project project2 = new ProjectImpl();
    	toDo2.setProject(project2);
    	
    	// ajout à la liste
    	listOfToDos.add(toDo1);
    	listOfToDos.add(toDo2);
    	
    	// construction des projets retournés
    	Project projectToReturn1 = new ProjectImpl();
    	project1.setCode("A");
    	Project projectToReturn2 = new ProjectImpl();
    	project2.setCode("B");
    	
    	mockToDoMapper.expectFindByUserPersistanceId(1, listOfToDos);

    	// injection des dépendances
    	MockCore.startBlock();

        mockProjectProxyUtil.expectInjectDependencies(project1, projectToReturn1);
    	mockProjectProxyUtil.expectInjectDependencies(project2, projectToReturn2);
       
    	MockCore.endBlock();
    	
    	// appel de la méthode
    	toDoRepository.findByUserPersistanceId(1);
    	
    	// contrôle des appels
    	MockCore.verify();
    	
       assertSame(toDo1.getProject(), projectToReturn1);
       assertSame(toDo2.getProject(), projectToReturn2);
    	
    }
    
    
    /**
     * Test que la repository renvoit bien des BasicProject "Advised".
     */
    public void testFindByProjectPersistanceIdAndUserPersistanceId() {
    
        List<ToDo> listOfToDos = new ArrayList<ToDo>();
    	
        // construction des deux ToDO retournés par le mockMapper
    	ToDo toDo1 = new ToDoImpl();
    	toDo.setDescription("toto");
    	Project project1 = new ProjectImpl();
    	toDo1.setProject(project1);
    	
    	ToDo toDo2 = new ToDoImpl();
    	toDo1.setDescription("titi");
    	Project project2 = new ProjectImpl();
    	toDo2.setProject(project2);
    	
    	// ajout à la liste
    	listOfToDos.add(toDo1);
    	listOfToDos.add(toDo2);
    	
    	// construction des projets retournés
    	Project projectToReturn1 = new ProjectImpl();
    	project1.setCode("A");
    	Project projectToReturn2 = new ProjectImpl();
    	project2.setCode("B");
    	
    	mockToDoMapper.expectFindByProjectPersistanceIdAndUserPersistanceId(1, 1, listOfToDos);

    	// injection des dépendances
    	MockCore.startBlock();

        mockProjectProxyUtil.expectInjectDependencies(project1, projectToReturn1);
    	mockProjectProxyUtil.expectInjectDependencies(project2, projectToReturn2);
       
    	MockCore.endBlock();
    	
    	// appel de la méthode
    	toDoRepository.findByProjectPersistanceIdAndUserPersistanceId(1, 1);
    	
    	// contrôle des appels
    	MockCore.verify();
    	
       assertSame(toDo1.getProject(), projectToReturn1);
       assertSame(toDo2.getProject(), projectToReturn2);
    	
    }


}
