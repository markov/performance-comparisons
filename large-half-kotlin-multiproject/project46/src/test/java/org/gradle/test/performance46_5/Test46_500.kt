package org.gradle.test.performance46_5

import org.junit.Assert.*

class Test46_500 {
    private val production = Production46_500("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
