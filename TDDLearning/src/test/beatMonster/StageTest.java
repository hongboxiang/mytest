package beatMonster; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static beatMonster.monster.MonsterFactory.monster;
import static beatMonster.player.PlayerFactory.archmage;
import static beatMonster.player.PlayerFactory.soldier;
import static beatMonster.skill.SkillFactory.behead;
import static beatMonster.skill.SkillFactory.freeze;
import static beatMonster.skill.SkillFactory.storm;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/** 
* Stage Tester. 
* 
* @author hongboxiang
* @since <pre>五月 6, 2016</pre> 
* @version 1.0 
*/ 
public class StageTest { 

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    } 

	@Test
	public void test_12级战士可以杀死12级怪物(){
		assertTrue(soldier(12).kill(monster(12)));
	}

	@Test
	public void test_12级战士不能杀死13级怪物(){
		assertFalse(soldier(12).kill(monster(13)));
	}

	@Test
	public void test_12级魔法师可以杀死18级怪物(){
		assertTrue(archmage(12).kill(monster(18)));
	}

	@Test
	public void test_12级魔法师不能杀死19级怪物(){
		assertFalse(archmage(12).kill(monster(19)));
	}

	@Test
	public void test_12级的战士通过暴风能杀死18级的怪物(){
		assertTrue(soldier(12).using(storm()).kill(monster(18)));
	}

	@Test
	public void test_12级的战士通过暴风不能杀死19级的怪物(){
		assertFalse(soldier(12).using(storm()).kill(monster(19)));
	}

	@Test
	public void test_12级的战士通过斩杀能杀死21级的怪物(){
		assertTrue(soldier(12).using(behead()).kill(monster(21)));
	}

	@Test
	public void test_12级的战士通过斩杀不能杀死22级的怪物(){
		assertFalse(soldier(12).using(behead()).kill(monster(22)));
	}

	@Test
	public void test_12级的魔法师通过冰冻魔法可杀死29级的怪物(){
		assertTrue(archmage(12).using(freeze()).kill(monster(29)));
	}

	@Test
	public void test_12级的魔法师通过冰冻魔法不能杀死30级的怪物(){
		assertFalse(archmage(12).using(freeze()).kill(monster(30)));
	}

}
