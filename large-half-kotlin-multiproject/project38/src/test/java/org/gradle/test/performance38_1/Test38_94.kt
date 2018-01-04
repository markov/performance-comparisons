package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_94 {
    private val production = Production38_94("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}