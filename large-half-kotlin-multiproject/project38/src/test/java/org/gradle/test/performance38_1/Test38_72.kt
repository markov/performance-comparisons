package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_72 {
    private val production = Production38_72("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}