package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_167 {
    private val production = Production38_167("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}