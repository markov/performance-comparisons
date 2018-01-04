package org.gradle.test.performance38_5

import org.junit.Assert.*

class Test38_482 {
    private val production = Production38_482("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}