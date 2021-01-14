package org.objectweb.asm.test;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;

import java.util.Arrays;

/**
 * @author Chris
 * @version 1.0.0
 * @date 2021/01/14
 */
public class TestCar {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader(BMWCar.class.getName());
        System.out.println(cr.getAccess());
        System.out.println(cr.getClassName());
        System.out.println(cr.getSuperName());
        System.out.println(Arrays.toString(cr.getInterfaces()));
        System.out.println(cr);

        // ClassNode cn = new ClassNode(Opcodes.ASM9);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.SKIP_FRAMES);
        System.out.println(cn);
    }
}
