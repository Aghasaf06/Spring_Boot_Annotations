package com.componentscan2;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyCustomFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader,
                            MetadataReaderFactory metadataReaderFactory) throws IOException {

        System.out.println(metadataReader.getClassMetadata().getClassName());

        if (metadataReader.getClassMetadata().getClassName().contains("MyClass")) {
            return true;
        }

        return false;
    }
}
