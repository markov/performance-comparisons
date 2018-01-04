package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_210 {
    private val production = Production11_210("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}