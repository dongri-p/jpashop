package jpabook.jpashop;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitDb {

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;
        public void dbInit1() {
            Member member = new Member();
            member.setName("username");
            member.setAddress(new Address("서울", "1", "11111"));
            em.persist(member);
        }
    }
}
