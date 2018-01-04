package org.gradle.test.performance31_1

import org.junit.Assert.*

class Test31_73 {
    private val production = Production31_73("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}