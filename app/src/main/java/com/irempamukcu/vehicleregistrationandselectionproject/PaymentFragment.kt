package com.irempamukcu.vehicleregistrationandselectionproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_payment.*

class PaymentFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        paymentCompleteButton.setOnClickListener {
            savePayment(it)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    // savePayment metodu için savePaymentisvalid methodu oluşturulacak. Bu method if blokları içinde kontrolü yapılan her durum için stringleri return etmeli.
    fun savePayment(view : View){
        val cardNumber = paymentCardNumberEditText.text.toString()
        val lastDateMonth = paymentCardLastDateMonthEditText.text.toString().toInt()
        val lastDateYear = paymentCardLastDateYearEditText.text.toString().toInt()
        val cvv = paymentCardCVVEditText.text.toString().toInt()
        val validator= PaymentValidator()

        if(!validator.isCardNumber(cardNumber)){
            context?.let{
                Toast.makeText(it,"Kart numarası 16 rakam olmalıdır.",Toast.LENGTH_LONG).show()
            }

        }
        if(!validator.isLastDateMonth(lastDateMonth.toString())){
            context?.let{
                Toast.makeText(it,"Bu alan boş bırakılamaz",Toast.LENGTH_LONG).show()
            }
        }
        if(!validator.isLastDateYear(lastDateYear.toString())){
            context?.let{
                Toast.makeText(it,"Bu alan boş bırakılamaz",Toast.LENGTH_LONG).show()
            }
        }
        if(!validator.isCVV(cvv.toString())){
            context?.let{
                Toast.makeText(it,"CVV 3 rakamdan oluşmalıdır",Toast.LENGTH_LONG).show()
            }
        }

       if(!(paymentCheckBox.isChecked)){
           context?.let{
               Toast.makeText(it,"Lütfen gerekli alanları doldurunuz",Toast.LENGTH_LONG).show()
           }
       }




    }


}