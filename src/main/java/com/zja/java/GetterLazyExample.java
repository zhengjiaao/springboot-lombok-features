///**
// * @Company: 上海数慧系统技术有限公司
// * @Department: 数据中心
// * @Author: 郑家骜[ào]
// * @Email: zhengja@dist.com.cn
// * @Date: 2021-11-16 14:49
// * @Since:
// */
//package com.zja.java;
//
///**
// *
// */
//public class GetterLazyExample {
//    private final java.util.concurrent.AtomicReference<java.lang.Object> cached = new java.util.concurrent.AtomicReference<java.lang.Object>();
//
//    public double[] getCached() {
//        java.lang.Object value = this.cached.get();
//        if (value == null) {
//            synchronized(this.cached) {
//                value = this.cached.get();
//                if (value == null) {
//                    final double[] actualValue = expensive();
//                    value = actualValue == null ? this.cached : actualValue;
//                    this.cached.set(value);
//                }
//            }
//        }
//        return (double[])(value == this.cached ? null : value);
//    }
//
//    private double[] expensive() {
//        double[] result = new double[1000000];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = Math.asin(i);
//        }
//        return result;
//    }
//}
