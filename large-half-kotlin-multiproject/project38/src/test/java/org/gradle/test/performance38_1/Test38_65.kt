package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_65 {
    private val production = Production38_65("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}