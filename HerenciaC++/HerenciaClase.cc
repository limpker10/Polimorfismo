#include <iostream>
#include <string>
using namespace std;

class Vehiculo
{
private:
  string marca;
public:
  Vehiculo(){marca = "No tiene";}
  Vehiculo(string x):marca(x){}
  virtual string info() {return marca;};
  virtual double precio() = 0;
};

class Camion : public Vehiculo
{
private:
  int carga;
public:
  Camion(){carga = 0;};
  Camion(int _carga,string x):carga(_carga),Vehiculo(x){}
  string info() { return Vehiculo::info() + to_string (carga);};
  double precio()
  {
    return 12.23;
  }
};

class Excabadora : public Vehiculo
{
private:
  string tamano;
public:
  Excabadora(){tamano = "No tiene";};
  Excabadora(string _tamano,string x):tamano(_tamano),Vehiculo(x){}
  string info() {  return Vehiculo::info() + tamano;};
  double precio()
  {
    return 13.2;
  }
  
};

class Shop
{
private:
  double caja = 0.0;

public:
  void regSale(Vehiculo *obj) { caja += obj->precio(); };
  double getTotal() { return caja; };
};

int main()
{
  Shop a;
  a.regSale(new Excabadora);
  a.regSale(new Camion);
  std::cout << "caja : " << a.getTotal();
  return 0;
}