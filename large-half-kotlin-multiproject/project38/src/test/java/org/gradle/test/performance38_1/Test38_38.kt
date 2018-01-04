package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_38 {
    private val production = Production38_38("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}