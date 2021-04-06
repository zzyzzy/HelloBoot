package zzyzzy.spring.helloboot.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zzyzzy.spring.helloboot.vo.MemberVO;

@Repository("mdao")
public class MemberDAOImpl implements MemberDAO {

    private SqlSession sqlSession;

    @Autowired
    public MemberDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public int insertMember(MemberVO mvo) {
        return sqlSession.insert("member.joinmember", mvo);
    }

    public int loginMember(MemberVO mvo) {
        return sqlSession.selectOne("member.loginmember", mvo);
    }

}
