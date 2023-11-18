package com.example.countriesrecycler

object CountryProvider {
    val countries = listOf(
        Country(countryUrl("AR"), "Argentina"),
        Country(countryUrl("AM"), "Armenia"),
        Country(countryUrl("BR"), "Brazil"),
        Country(countryUrl("CA"), "Canada"),
        Country(countryUrl("CN"), "China"),
        Country(countryUrl("CY"), "Cyprus"),
        Country(countryUrl("DK"), "Denmark"),
        Country(countryUrl("EG"), "Egypt"),
        Country(countryUrl("FR"), "France"),
        Country(countryUrl("GE"), "Georgia"),
        Country(countryUrl("DE"), "Germany"),
        Country(countryUrl("IN"), "India"),
        Country(countryUrl("IT"), "Italy"),
        Country(countryUrl("JP"), "Japan"),
        Country(countryUrl("KZ"), "Kazakhstan"),
        Country(countryUrl("KR"), "Korea"),
        Country(countryUrl("MX"), "Mexico"),
        Country(countryUrl("MD"), "Moldova"),
        Country(countryUrl("NE"), "Niger"),
        Country(countryUrl("PL"), "Poland"),
        Country(countryUrl("RO"), "Romania"),
        Country(countryUrl("RU"), "Russia"),
        Country(countryUrl("RS"), "Serbia"),
        Country(countryUrl("SG"), "Singapore"),
        Country(countryUrl("SY"), "Syria"),
        Country(countryUrl("SE"), "Sweden"),
        Country(countryUrl("TR"), "Turkey"),
        Country(countryUrl("UA"), "Ukraine"),
        Country(countryUrl("US"), "United States"),
    )

    private fun countryUrl(code: String) = "https://flagsapi.com/$code/flat/64.png"
}