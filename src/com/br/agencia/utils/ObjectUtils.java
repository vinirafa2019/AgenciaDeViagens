package com.br.agencia.utils;

import java.rmi.server.ObjID;

public class ObjectUtils {

        public static String generateStringID() {
                      ObjID id = new ObjID();
                      return id.toString();
        }

        public static int generateIntID() {
                      ObjID id = new ObjID();
                      return id.hashCode();
        }

}