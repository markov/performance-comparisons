package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_27 {
    private val production = Production38_27("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}