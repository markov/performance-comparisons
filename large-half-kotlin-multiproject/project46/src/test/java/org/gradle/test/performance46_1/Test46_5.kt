package org.gradle.test.performance46_1

import org.junit.Assert.*

class Test46_5 {
    private val production = Production46_5("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
