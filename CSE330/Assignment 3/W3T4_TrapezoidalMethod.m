function [result] = TrapezoidalMethod(f,xl,xu,h,interval)
    x=xl: h: xu;
for k=1: length(x)
    y(k) = f(x(k));
end

    a = 0;
for i=1: length(x)-1
    a = a+(y(i)+y(i+1))*h/2;
end

    result = a;

end

