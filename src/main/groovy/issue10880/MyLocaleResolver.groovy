package issue10880

import org.springframework.web.servlet.LocaleResolver

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class MyLocaleResolver implements LocaleResolver {

    @Override
    Locale resolveLocale(HttpServletRequest request) {
        println "----> resolveLocale"
        return Locale.default
    }

    @Override
    void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
        println "----> setLocale"
    }
}
