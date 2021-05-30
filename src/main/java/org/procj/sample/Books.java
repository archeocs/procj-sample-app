package org.procj.sample;

import org.procj.core.Procj;

public class Books {

	public static void main(String[] args) {
		
		BooksManager manager = Procj.getInstance().create(BooksManager.class);
		manager.addBook("Book " + manager.countBooks());
		System.out.println(manager.countBooks());
	}

}
