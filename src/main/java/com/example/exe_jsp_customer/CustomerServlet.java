package com.example.exe_jsp_customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "helloServlet", value = "/customer")
    public class CustomerServlet extends HelloServlet {
        private String message;

        public void init() {
            message = "Hello World!";
        }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        }
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<Customer> customerList = new ArrayList<>();
            customerList.add(new Customer("Thor","29/10/1999","Bắc Giang","https://photo-cms-nghenhinvietnam.zadn.vn/Uploaded/trunghieu/2020_07_08/1398736_ALWF.jpg"));
            customerList.add(new Customer("Hulk","29/10/1999","Hà Nội","https://ss-images.saostar.vn/2020/03/02/7083861/5.jpg"));
            customerList.add(new Customer("Iron Man","29/10/1999","Hải Phòng","https://vnreview.vn/image/19/33/02/1933022.jpg"));
            customerList.add(new Customer("Dr Strange","29/10/1999","Bắc Ninh","https://starlight.vn/Areas/Admin/Content/Fileuploads/images/POSTER/doctor-strange-trong-da-vu-tru-cua-con-dien-stephan-strange-hinh-nen-1920x1080_48.jpg"));


            request.setAttribute("customerList",customerList);
            System.out.println(customerList.get(1));

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer_list.jsp");
            requestDispatcher.forward(request,response);
        }
    }
