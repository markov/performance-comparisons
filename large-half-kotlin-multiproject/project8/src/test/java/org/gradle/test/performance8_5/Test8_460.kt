package org.gradle.test.performance8_5

import org.junit.Assert.*

class Test8_460 {
    private val production = Production8_460("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}