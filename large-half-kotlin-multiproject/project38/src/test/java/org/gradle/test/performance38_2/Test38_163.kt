package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_163 {
    private val production = Production38_163("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}