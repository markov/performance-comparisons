package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_162 {
    private val production = Production11_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}