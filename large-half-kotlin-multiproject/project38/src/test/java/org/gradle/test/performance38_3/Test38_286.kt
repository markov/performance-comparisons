package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_286 {
    private val production = Production38_286("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}