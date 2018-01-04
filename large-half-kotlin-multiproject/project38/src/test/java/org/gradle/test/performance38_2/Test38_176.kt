package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_176 {
    private val production = Production38_176("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}