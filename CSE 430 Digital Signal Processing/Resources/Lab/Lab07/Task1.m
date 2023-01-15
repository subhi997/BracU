close all
clear all

x1 = [1 1 1 1 1 0 0 0];
x2 = [1 1 1 1 1 0 0 0];



X1 = fft(x1);
X2 = fft(x2);

X=conv(X1,X2);
x = real(ifft(X))
% t=0:N-1;
% subplot(311)
% stem(t,x);
% xlabel('Time (s)');
% ylabel('Amplitude');
% title('Input sequence')
% 
% subplot(312); 
% stem(0:N-1,abs(fft(x)));  
% xlabel('Frequency');
% ylabel('|X(k)|');
% title('Magnitude Response'); 

% subplot(213); 
% stem(0:N-1,angle(fft(x1)));
% xlabel('Frequency');
% ylabel('Phase');
% title('Phase Response'); 
