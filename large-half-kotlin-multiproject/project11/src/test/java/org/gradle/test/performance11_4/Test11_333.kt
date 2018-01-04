package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_333 {
    private val production = Production11_333("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}