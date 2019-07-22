function [root, ea]= bisect (f, xl, xu, erlimit, maxit)
clc;
if (f(xl)*f(xu)<=0)
    xmold=xl;
    for c=1:1:maxit
        xm=(xl+xu)/2;
        if (f(xl)*f(xm)<0)
            xu=xm;
        elseif (f(xl)*f(xu)==0)
            root=xm;
            ea = abs(abs((xm-xmold)/xm))*100;
            break;
        else
            xl=xm;
        end
        ea = abs(abs((xm-xmold)/xm))*100;
        xmold=xm;
        if (ea <= erlimit || c > maxit)
            break;
        end
    end
end
root=xm;
end 


