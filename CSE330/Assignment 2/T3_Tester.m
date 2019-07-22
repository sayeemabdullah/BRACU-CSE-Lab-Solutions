[root, ea]= bisect (@ (x) exp(-x)*((3.2*sin(x))-(0.5*cos(x))), 3, 4, 0.001, 3);
fprintf('Approximate error:')
disp(ea);
fprintf('Root:')
disp(root);[root, ea]= bisect (@ (x) exp(-x)*((3.2*sin(x))-(0.5*cos(x))), 3, 4, 0.001, 3);
fprintf('Approximate error:')
disp(ea);
fprintf('Root:')
disp(root);