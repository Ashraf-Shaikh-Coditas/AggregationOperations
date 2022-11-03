package bean;

import util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TeacherAggregation {
    public static void count() {
        EntityManager em = JPAUtil.getFactory().createEntityManager();
        Query query = em.createQuery(
                "SELECT COUNT(t) FROM Teacher t");
        Long result = (Long) query.getSingleResult();
        System.out.println("Count of Teachers is : "+result);
        em.close();
    }

    public static void minSalary() {
        EntityManager em = JPAUtil.getFactory().createEntityManager();
        Query query = em.createQuery(
                "SELECT min(t.salary) FROM Teacher t");
        Double result = (Double) query.getSingleResult();
        System.out.println("Minimum Salary of Teachers is : "+result);
        em.close();
    }

    public static void maxSalary() {
        EntityManager em = JPAUtil.getFactory().createEntityManager();
        Query query = em.createQuery(
                "SELECT max(t.salary) FROM Teacher t");
        Double result = (Double) query.getSingleResult();
        System.out.println("Maximum Salary of Teachers is : "+result);
        em.close();
    }

    public static void sumSalary() {
        EntityManager em = JPAUtil.getFactory().createEntityManager();
        Query query = em.createQuery(
                "SELECT sum(t.salary) FROM Teacher t");
        Double result = (Double) query.getSingleResult();
        System.out.println("Sum  of salaries is : "+result);
        em.close();
    }

    public static void averageSalary() {
        EntityManager em = JPAUtil.getFactory().createEntityManager();
        Query query = em.createQuery(
                "SELECT avg(t.salary) FROM Teacher t");
        Double result = (Double) query.getSingleResult();
        System.out.println("Avg of salary is : "+result);
        em.close();
    }
}
