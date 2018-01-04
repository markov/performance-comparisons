package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_188 {
    private val production = Production11_188("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}