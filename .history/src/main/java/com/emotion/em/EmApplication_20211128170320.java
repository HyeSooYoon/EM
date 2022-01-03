package com.emotion.em;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy 
public class EmApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(EmApplication.class, args);



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n1 = 0;
		
		String[] inputs = input.split(" ");
		int input1 = 1;//Integer.parseInt(inputs[0]);
		int input2 = 6;//Integer.parseInt(inputs[1]);
		
		StringBuffer str = new StringBuffer();
		
		for(int i=input1; i<=input2; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					n1 = n1 + j;				
				}
				
			System.out.println(i);
				
			if(n1==i)
			{
				str.append(Integer.toString(n1));
			}	
			}
			
		}
		 
		System.out.println(str);
	}

}
