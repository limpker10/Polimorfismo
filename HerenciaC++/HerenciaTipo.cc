#include <iostream>
#include <string>
using namespace std;

class Vehiculo
{
private:
  string marca;
public:
  Vehiculo(){marca = "No tiene";}
  virtual double precio() = 0;
};

class Camion : public Vehiculo
{
public:
  double precio() { return 12.23;}
};

class Excabadora : public Vehiculo
{
public:
  double precio() { return 13.2; }
};

class Fruta
{
private:
  string color;
public:
  double precio() { return 3.2; }
};

class Shop
{
private:
  double caja = 0.0;

public:
  Shop();
  void regSale(Vehiculo *obj) { caja += obj->precio(); };
  double getTotal() { return caja; };
};

int main()
{
  Shop a;
  a.regSale(new Excabadora);
  a.regSale(new Camion);
  a.regSale(new Fruta);
  std::cout << "caja : " << a.getTotal();
  return 0;
}