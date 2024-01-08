import heritage.joined_table.CreditCardPayment;
import heritage.joined_table.PayPalPayment;
import heritage.single_table.CreditCardPayment1;
import heritage.single_table.PayPalPayment1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import java.sql.Statement;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transac = null;
        try {
            transac = session.getTransaction();
            transac.begin();

//            CreditCardPayment creditCardPayment = new CreditCardPayment();
//            creditCardPayment.setCardNumber("123456");
//            creditCardPayment.setPaymentDate(new Date());
//            creditCardPayment.setExpirationDate("22/02/2025");
//
//            PayPalPayment payPalPayment = new PayPalPayment();
//            payPalPayment.setAccountNumber("123456789");
//            payPalPayment.setPaymentDate(new Date());
//            payPalPayment.setAmount(190.30);
//
//            session.save(payPalPayment);
//            session.save(creditCardPayment);

            CreditCardPayment1 creditCardPayment1 = new CreditCardPayment1();
            creditCardPayment1.setCardNumber("741852963");
            creditCardPayment1.setPaymentDate(new Date());
            creditCardPayment1.setExpirationDate("19/03/2026");

            PayPalPayment1 payPalPayment1 = new PayPalPayment1();
            payPalPayment1.setAccountNumber("321654987");
            payPalPayment1.setAmount(789.45);
            payPalPayment1.setPaymentDate(new Date());

            session.save(creditCardPayment1);
            session.save(payPalPayment1);

            System.out.println(creditCardPayment1.toString());
            System.out.println(payPalPayment1.toString());

            transac.commit();

        } catch (Exception e) {
            if (transac != null) {
                transac.rollback();
                e.printStackTrace();

            }

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
