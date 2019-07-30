fx = @ (x) cos(10*pi*x) + sin(35*pi*x);
v = 2;
deltax = 0.001;
pdel=v+deltax;
mdel=v-deltax;
front = (fx(pdel)-fx(v))/deltax;
back = (fx(v)-fx(mdel))/deltax;
center = (fx(pdel)-fx(mdel))/(2*deltax);

disp(front);
disp(center);
disp(back);
