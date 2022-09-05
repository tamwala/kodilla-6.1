package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Strawberries");
        Item item1 = new Item(new BigDecimal(120), 10, new BigDecimal(17));
        Item item2 = new Item(new BigDecimal(220), 20, new BigDecimal(27));
        Invoice invoice = new Invoice("0001/2022");


        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product);

        //When
        productDao.save(product);
        invoiceDao.save(invoice);
        int id = invoice.getId();


        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
