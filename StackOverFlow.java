package com.exception;

public class StackOverFlow {

		void m2()
			{
				m1();
			}
		void m1()
			{
				m2();
			}
		public static void main(String[] args) {
		    new StackOverFlow().m1();
				
					}
				}


