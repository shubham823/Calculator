package com.client;

import com.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class cal implements EntryPoint {
	String s1="",s2="";
	int x=0;
	@Override
	public void onModuleLoad() {
		//String s1="",s2="";
		//int x=0;
		Button b2[]=new Button[10];
		Button b[]=new Button[10];
		TextBox t1=new TextBox();
		Button b1=new Button("+");
		Button b3=new Button("/");
		Button b4=new Button("-");
		Button b5=new Button("*");
		Button b6=new Button("=");
		RootPanel.get().add(t1);
		for(int i=0;i<10;i++)
		{	
			 b[i]=new Button(""+i);
			 RootPanel.get().add(b[i]);
		}
		RootPanel.get().add(b1);
		//RootPanel.get().add(b2);
		RootPanel.get().add(b3);
		RootPanel.get().add(b4);
		RootPanel.get().add(b5);
		RootPanel.get().add(b6);
		b1.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				s2="+";
				x=Integer.parseInt(s1);
				s1="";
				t1.setText("");
				}
		});
		b3.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				s2="/";
				x=Integer.parseInt(s1);
				s1="";
				t1.setText("");
			
				}
		});
		b4.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				s2="-";
				x=Integer.parseInt(s1);
				s1="";
				t1.setText("");
			
				}
		});
		b5.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				s2="*";
				x=Integer.parseInt(s1);
				s1="";
				t1.setText("");
			
				}
		});
		
		b6.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				if(s2.equals("+"))
				{
					x=x+Integer.parseInt(s1);
					s1=Integer.toString(x);
					t1.setText(s1);
				}
				if(s2.equals("-"))
				{
					x=x-Integer.parseInt(s1);
					s1=Integer.toString(x);
					t1.setText(s1);
				}
				if(s2.equals("*"))
				{
					x=x*Integer.parseInt(s1);
					s1=Integer.toString(x);
					t1.setText(s1);
				}
				if(s2.equals("/"))
				{
					x=x/Integer.parseInt(s1);
					s1=Integer.toString(x);
					t1.setText(s1);
				}
			}
		});
		for(int i=0;i<10;i++)
		{	String s= b[i].getText();
			b[i].addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				s1=s1+s;
				t1.setText(s1);
				
			}
		});
			
			
			 
		}
	}
}
	

   
   


