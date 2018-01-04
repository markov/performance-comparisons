package org.gradle.test.performance11_5

import org.junit.Assert.*

class Test11_442 {
    private val production = Production11_442("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}