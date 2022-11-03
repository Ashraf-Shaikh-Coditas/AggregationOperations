package bean;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ashraf");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
//
//        Root<Teacher> from = criteriaQuery.from(Teacher.class);
//        System.out.println("Select all records from Teacher ");
//        CriteriaQuery<Object> select = criteriaQuery.select(from);
//        TypedQuery<Object> typedQuery = entityManager.createQuery(select);
//        List<Object> resultlist = typedQuery.getResultList();
//
////        resultlist.stream().forEach(System.out::println);
//
//        CriteriaQuery<Object> select1 = criteriaQuery.select(criteriaBuilder.min(from.get("salary")));
//        TypedQuery<Object> typedQuery1 = entityManager.createQuery(select1);
//        List<Object> resultlist1 = typedQuery1.getResultList();
//
//        resultlist1.stream().forEach(System.out::println);
//
//
//        CriteriaQuery<Object> select2 = criteriaQuery.select(from).where(criteriaBuilder.between(from.get("salary"),10000,25000));
//        TypedQuery<Object> typedQuery2 = entityManager.createQuery(select2);
//        List<Object> resultlist2 = typedQuery2.getResultList();
//
//        resultlist2.stream().forEach(System.out::println);
//
//        System.out.println("***********************************************************************");
//        Predicate p = criteriaBuilder.like(from.get("tname"),"A%");
//        CriteriaQuery<Object> select3 = criteriaQuery.select(from).where(p);
//        TypedQuery<Object> typedQuery3 = entityManager.createQuery(select3);
//        List<Object> resultlist3 = typedQuery3.getResultList();
//
//        resultlist3.stream().forEach(System.out::println);
//
//
//
//
//
//
//

        TeacherAggregation.averageSalary();
        TeacherAggregation.count();
        TeacherAggregation.maxSalary();
        TeacherAggregation.minSalary();
        TeacherAggregation.sumSalary();

    }
}
