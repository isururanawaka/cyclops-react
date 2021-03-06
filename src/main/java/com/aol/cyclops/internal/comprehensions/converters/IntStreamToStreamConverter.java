package com.aol.cyclops.internal.comprehensions.converters;

import java.util.stream.LongStream;
import java.util.stream.Stream;

import com.aol.cyclops.types.extensability.MonadicConverter;

import lombok.val;

public class IntStreamToStreamConverter implements MonadicConverter<Stream>{

	public static int priority = 5;
	public int priority(){
		return priority;
	}
	@Override
	public boolean accept(Object o) {
		return (o instanceof LongStream);
			
	}

	@Override
	public Stream convertToMonadicForm(Object f) {
		val s = (LongStream)f;
		return s.boxed();
	}
	
	

}
