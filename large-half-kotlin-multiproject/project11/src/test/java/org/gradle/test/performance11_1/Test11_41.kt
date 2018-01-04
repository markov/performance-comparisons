package org.gradle.test.performance11_1

import org.junit.Assert.*

class Test11_41 {
    private val production = Production11_41("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}