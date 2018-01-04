package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_196 {
    private val production = Production11_196("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}