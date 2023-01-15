close all
clear all
clc

n=-10:10;
[a,b] = size(n);
r=zeros(a,11);
for i=11:b
if n(i) >= 0
    r(i) = n(i);

end
end
stem(n,r)
xlabel('n');
ylabel('r(n)');
title('Unit Ramp Signal ');
axis([-12 12 0 11])
