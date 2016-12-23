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
* @since <pre>���� 6, 2016</pre> 
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
	public void test_12��սʿ����ɱ��12������(){
		assertTrue(soldier(12).kill(monster(12)));
	}

	@Test
	public void test_12��սʿ����ɱ��13������(){
		assertFalse(soldier(12).kill(monster(13)));
	}

	@Test
	public void test_12��ħ��ʦ����ɱ��18������(){
		assertTrue(archmage(12).kill(monster(18)));
	}

	@Test
	public void test_12��ħ��ʦ����ɱ��19������(){
		assertFalse(archmage(12).kill(monster(19)));
	}

	@Test
	public void test_12����սʿͨ��������ɱ��18���Ĺ���(){
		assertTrue(soldier(12).using(storm()).kill(monster(18)));
	}

	@Test
	public void test_12����սʿͨ�����粻��ɱ��19���Ĺ���(){
		assertFalse(soldier(12).using(storm()).kill(monster(19)));
	}

	@Test
	public void test_12����սʿͨ��նɱ��ɱ��21���Ĺ���(){
		assertTrue(soldier(12).using(behead()).kill(monster(21)));
	}

	@Test
	public void test_12����սʿͨ��նɱ����ɱ��22���Ĺ���(){
		assertFalse(soldier(12).using(behead()).kill(monster(22)));
	}

	@Test
	public void test_12����ħ��ʦͨ������ħ����ɱ��29���Ĺ���(){
		assertTrue(archmage(12).using(freeze()).kill(monster(29)));
	}

	@Test
	public void test_12����ħ��ʦͨ������ħ������ɱ��30���Ĺ���(){
		assertFalse(archmage(12).using(freeze()).kill(monster(30)));
	}

}
