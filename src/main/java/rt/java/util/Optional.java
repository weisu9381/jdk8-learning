package rt.java.util;

import java.util.function.Consumer;

/**
 * a container object which may or may not contain a non-null value.
 * 一个容器对象 可能包含 也 可能不包含 非空值
 * If a value is present, {@code isPresent()} will return true and {@code get()} will return the value
 * 如果它存在一个值, 则 isPresent() 会返回true, get()会返回该值
 * <p>Additional methods that depend on the presence or absence of a contained value are provided,
 * 这些决定了包含值存在还是不存在的附加方法是受保护的
 * suck as {@link #orElse(java.lang.Object) orElse()} (return a default value if value not present) and
 * 例如方法orElse() (如果值不存在的话就返回一个默认值),
 * {@link #ifPresent(rt.java.util.function.Consumer) ifPresent()} (execute a block of code if the value is present).
 * 和方法ifPresent() (如果值存在的话就执行一段代码)
 *
 * this is a <a href="../lang/doc_files/ValueBased.html">value-based class </a>:
 * 这是一个 value-based 类:
 * use of identity-sensitive operations (including reference equality ({@code ==}), identity hash code and synchronization)
 * on instance of {@code Optional} may have unpredictable results and should be avoided.
 * 对Optional类的实例使用身份敏感的操作(包括引用等式==, 身份哈希码和同步)可能会有不可预知的结果,要尽量避免.
 */
public class Optional{
    private static final String[] str = {"123","1234"};

    public static void main(String[] args) {
        String str1 = "1234";
        str[0] = "1231";
    }
}
