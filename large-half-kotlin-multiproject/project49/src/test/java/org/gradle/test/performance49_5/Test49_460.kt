package org.gradle.test.performance49_5

import org.junit.Assert.*

class Test49_460 {
    private val production = Production49_460("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
