package org.gradle.test.performance33_1

import org.junit.Assert.*

class Test33_2 {
    private val production = Production33_2("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}